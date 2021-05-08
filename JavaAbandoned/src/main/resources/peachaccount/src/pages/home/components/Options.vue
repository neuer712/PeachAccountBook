<template>
    <div class="options">
        <div class="option-item"
        v-for="(item,index) of list" 
        :key=index
        :class="[item.class]"
        @click="handleClick(item.name)">
            <div class="wrapper">
                <img :src="item.url" class="img">
            </div>
            <div class="title">{{item.title}}</div>
        </div>
        <!-- <div class="option-item m-bot">
            <div class="wrapper">
                <img src="../imgs/option2.png" class="img">
            </div>
            <div class="title">图表统计</div>
        </div>
        <div class="option-item m-right">
            <div class="wrapper">
                <img src="../imgs/option3.png" class="img">
            </div>
            <div class="title">流水明细</div>
        </div>
        <div class="option-item">
            <div class="wrapper">
                <img src="../imgs/option4.png" class="img">
            </div>
            <div class="title">账户管理</div>
        </div> -->
    </div>
</template>


<script>
export default {
    name:'HomeOptions',
    data (){
        return {
            list:[
            {name:'account',url:require('../imgs/option1.png'),title:'开始记账',class:'m-bot m-right'},
            {name:'charts',url:require('../imgs/option2.png'),title:'图表统计',class:'m-bot'},
            {name:'detail',url:require('../imgs/option3.png'),title:'流水明细',class:'m-right'},
            {name:'manage',url:require('../imgs/option4.png'),title:'账户管理'}
            ]
        }  
    },
    methods: {
        handleClick (name){
            this.$emit('Change',name)
        }
    }
}
</script>




<style lang="stylus" scoped>
    @import '~styles/varibles.styl'
    @import '~styles/mixins.styl'
        .options
            width 6.65rem
            height 6.65rem
            float right
            margin 1rem 1rem 1.4rem 0
            .option-item
                width 3.2rem
                height 3.2rem
                background #fff
                float left
                border-radius .3rem
                .wrapper
                    width 2rem
                    height 2rem
                    margin .3rem .6rem 0 .6rem
                    .img
                        width 100%
                .title
                    font-size .5rem
                    font-family $HP
                    color $Orange
                    text-align center
                    -webkit-text-stroke 1px $Black2
            .m-bot
                margin-bottom .25rem
            .m-right 
                margin-right .25rem
</style>