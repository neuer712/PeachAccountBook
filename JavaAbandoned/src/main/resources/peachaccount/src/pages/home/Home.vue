<template>
    <div class="home">
        <home-header></home-header>
        <div class="wrapper">
            <home-list></home-list>
            <home-options @Change="handleShow"></home-options>
        </div>
        <home-account 
        v-show="accountShow"
        @Close="handleClose"
        ></home-account>
        <home-detail 
        v-show="detailShow" 
        :list="list" 
        :typeMap="typeMap"
        @click="getDetailInfo"
        @Close="handleClose"></home-detail>
        <home-charts
        v-show="chartsShow"
        @Close="handleClose"
        ></home-charts>
    </div>
</template>


<script>
import HomeHeader from './components/Header'
import HomeList from './components/List'
import HomeOptions from './components/Options'
import HomeAccount from './components/Account'
import HomeDetail from './components/Detail'
import HomeCharts from './components/Charts'
import axios from 'axios'
export default {
  name: 'Home',
  components: {
      HomeHeader,
      HomeList,
      HomeOptions,
      HomeAccount,
      HomeDetail,
      HomeCharts
  },
  data (){
      return {
          accountShow: false,
          detailShow: false,
          chartsShow: false,
          list:[],
          typeMap: {},
          chartsData:{}
      }
  },
  methods: {
    handleShow (data){
        switch (data) {
            case 'account':
                this.accountShow = true;
                break;
            case 'charts':
                this.chartsShow = true;
                this.getChartsInfo();
                break;
            case 'detail':
                this.detailShow = true;
                this.getDetailInfo ();
                break;
            case 'manage':
                this.manageShow = true;
                break;
        }
    },
    handleClose (data){
        switch (data) {
            case 'account':
                this.accountShow = false;
                break;
            case 'charts':
                this.chartsShow = false;
                break;
            case 'detail':
                this.detailShow = false;
                break;
            case 'manage':
                this.manageShow = false;
                break;
        }
    },
    getDetailInfo (){
        axios.get('/api/all?page=1&size=25')
            .then(this.handleGetDetailInfoSucc)
    },
    handleGetDetailInfoSucc (res){
        const data = res.data
        console.log(res)
        this.list = data.pageAccounts
        this.typeMap = data.itemTypeMap
    },
    getChartsInfo (){
        axios.get('/api/accontSumGraphGroupByType')
            .then(this.handleGetChartsInfoSucc)
    },
    handleGetChartsInfoSucc (res){
        res = res.data
        const data = res.data
        this.$Bus.$emit('renderChart',data)
    }
  }
}
</script>


<style lang="stylus" scoped>
 @import '~styles/mixins.styl'
    .home
        background #3c6370
        &:after
            clear()
        .wrapper
            width 20rem
            height 2.15rem
            margin 0 auto
            box-sizing border-box 
</style>