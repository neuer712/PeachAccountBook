<template>
    <div class="layout">
        <div class="account">
            <div class="wrapper">
                <div class="caption">
                    <div class="tabs tabs-income">收入</div>
                    <div class="tabs tabs-expend">支出</div>
                    <div class="tabs close">
                        <span class="iconfont account-close-icon" @click=handleCloseClick>&#xe608;</span>
                    </div>
                </div>
                <div class="content">
                    <div class="lastEdition">
                        <div class="title">最近编辑</div>
                        <div class="editContent">content</div>
                    </div>
                    <div class="edition">
                        <div class="rows">
                            <div class="account-icon"><span class="iconfont">&#xe6ed;</span><span class="desc">名称</span></div>
                            <input class="input" type="text">
                        </div>
                       <div class="rows">
                            <div class="account-icon"><span class="iconfont">&#xef11;</span><span class="desc">类型</span></div>
                            <input class="input" type="text">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</template>

<script>
export default {
    name:'HomeAccount',
    methods: {
        handleCloseClick (){
            this.$emit('Close','account')
        }
    }
}
</script>



<style lang="stylus" scoped>
    @import '~styles/varibles.styl'
    @import '~styles/mixins.styl'
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
                .tabs.tabs-income
                    margin-left 6.45rem
                    margin-right .85rem

                .tabs.close
                    float right
                    width .85rem
                    margin-right .2rem
            .content
                width 16.8rem 
                height  7.6rem
                background $White
                border-radius .3rem
                box-shadow 2px 2px 5px rgba(100,100,100,.4)
                padding .7rem .6rem
                .lastEdition
                    margin-left .5rem
                    height 1.2rem
                    margin-bottom .5rem
                    .title
                        line-height .7rem
                        font-family $HP
                        color $Black2
                        font-size .34rem
                .edition 
                    width 10.5rem
                    height 5.4rem
                    margin 0 auto
                    .rows
                        width 5.25rem
                        height .5rem
                        margin-bottom .3rem
                        clear()
                        .account-icon
                            float left 
                            margin-right .3rem
                            height .5rem
                            line-height .5rem
                            .iconfont 
                                font-size .36rem
                            .desc
                                text-align center
                                font-size .32rem
                                margin-left .2rem
                        .input
                            float left
                            height .5rem
                        


</style>