<template>
    <div class="layout">
        <div class="detail">
            <div class="wrapper">
                <div class="caption">
                    <div class="tabs close">
                        <span class="iconfont detail-close-icon" @click=handleCloseClick>&#xe608;</span>
                    </div>
                </div>
                <div class="content">
                    <div class="content-wrapper">
                        
                    </div>
                    <div class="calendar">
                         <vue-datepicker-local v-model="range" @confirm="confirm" show-buttons/>
                    </div>
                    <div class="list">
                        <div class="list-title">流水明细</div>
                        <div class="list-items">
                            <div class="listOptions">
                                <div class="list-itemRows">
                                    <div class="option item long">名称</div>
                                    <div class="option item long">类型</div>
                                    <div class="option item short">价格</div>
                                    <div class="option item short">时间</div>
                                    <div class="option item remarks">备注</div>
                                </div>
                            </div>
                            <div class="listRows">
                                <div class="list-itemRows" 
                                v-for="(item,index) of list"
                                :key="index"
                                >
                                    <div class="item long">{{item.itemName}}</div>
                                    <div class="item long">{{typeMap[item.itemType]}}</div>
                                    <div class="item">{{item.itemCash}}</div>
                                    <div class="item">{{item.itemDate.slice(0,item.itemDate.indexOf('T'))}}</div>
                                    <div class="item remarks">{{item.itemRemark}}</div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                    <div class="btns">
                        <div class="btn"><span class="iconfont last">&#xe60f;</span></div>
                        <div class="btn"><span class="iconfont homePage">&#xe62f;</span></div>
                        <div class="btn r-btn"><span class="iconfont next">&#xe610;</span></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</template>

<script>
import VueDatepickerLocal from 'vue-datepicker-local'
import axios from 'axios'
export default {
    name:'HomeDetail',
    components: {
        VueDatepickerLocal
    },
    props:{
        list:Array,
        typeMap:Object
    },
    data () {
    return {
        range: [new Date(),new Date()]
    }
  },
    methods: {
        handleCloseClick (){
            this.$emit('Close','detail')
        },
        confirm (){
            console.log(this.range)
            axios.get('/api/all?page=1&size=25',{
                params:{
                    startDate:this.range[0],
                    endDate:this.range[1]
                }
            }).then(this.getDateInfoSucc)
        },
        getDateInfoSucc (res){
            const data = res.data
            this.list = data.pageAccounts
            this.typeMap = data.itemTypeMap
        }
    }
}
</script>



<style lang="stylus" scoped>
    @import '~styles/varibles.styl'
    .layout
        position fixed
        top 0
        right 0
        bottom 0
        left 0
        background $Layout
        z-index 9
        .wrapper
            width 18rem
            height 9.66rem
            margin 0 auto
            margin-top 2rem
            .caption
                height .66rem
                .tabs
                    width 1.7rem
                    height .64rem
                    line-height .64rem
                    background $Orange2
                    border 1px solid #666
                    border-radius .1rem
                    float left
                    font-size .32rem
                    text-align center
                .tabs.close
                    float right
                    width .85rem
                    margin-right .2rem
                    .detail-close-icon
                        cursor pointer
            .content
                width 18rem 
                height  9rem
                background $White
                border-radius .3rem
                box-shadow 2px 2px 5px rgba(100,100,100,.4)
                padding .5rem 0
                box-sizing border-box
                position relative
                .calendar
                    width 6.5rem
                    height .7rem
                    border 1px solid $Border
                    background #fff
                    position absolute
                    left 50%
                    margin-left -3.25rem
                .list 
                    width 12.5rem
                    height 6rem
                    border 1px solid $Border
                    background #fff
                    position absolute
                    top 1.6rem
                    left 50%
                    margin-left -6.25rem
                    .list-title
                        margin-top .3rem
                        text-align center
                        font-size .4rem
                        font-family $HP
                        color $Black2
                    .list-items
                        margin .3rem .5rem .3rem .5rem
                        position absolute
                        top .6rem
                        right 0
                        bottom 0
                        left 0 
                        overflow-y auto
                        overflow-x hidden
                    .listOptions
                        position fixed
                        z-index 2
                        background #fff
                    .listRows 
                        width auto 
                        height auto
                        position absolute
                        top .6rem
                    .list-itemRows
                        width 11.5rem
                        height .6rem
                        line-height .6rem
                        text-align center
                        .item
                            float left
                            width 1.25rem
                            font-size .22rem
                            white-space nowrap
                            overflow hidden
                            text-overflow ellipsis
                        .option 
                            font-size .26rem
                            font-weight bold
                        .item.remarks
                            width 4rem
                        .item.long
                            width 2.5rem
                .btns
                    position absolute
                    left 50%
                    transform translateX(-50%)
                    bottom .5rem
                    .btn
                        float left 
                        width .6rem
                        height .6rem
                        line-height .6rem
                        background $Orange2
                        margin-right .5rem
                        text-align center
                        border-radius 50%
                        cursor pointer
                        color $Black
                        .iconfont 
                            font-size .34rem
                        .homePage
                            font-size .38rem
                    .r-btn
                        margin-right 0
</style>