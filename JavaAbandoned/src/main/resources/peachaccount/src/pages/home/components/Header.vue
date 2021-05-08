<template>
    <div class="header">
        <div class="wrapper">
            <div class="logo">
                <div class="img-wrapper">
                    <img src="../imgs/logo.png" class="logo-img">
                </div>
            </div>
            <div class="title">桃桃记账</div>
            <div class="input">输入关键字查询</div>
            <div class="icon">
                <span class="header-icon-search iconfont">&#xe6ab;</span>
            </div>
            
            <div class="avator"></div>
        </div>
        
    </div>
</template>


<script>
export default {
    name:'HomeHeader'
}
</script>


<style lang="stylus" scoped>
    @import '~styles/varibles.styl'
    @import '~styles/mixins.styl'
    .header 
        width 100%
        .wrapper
            width 20rem
            height 2.15rem
            margin 0 auto
            box-sizing border-box
            clear()
            .logo
                width 2.15rem
                margin-top .16rem
                margin-right .53rem
                float left
                .img-wrapper
                    width 100%
                    height 0
                    padding-bottom 83.33%
                    overflow hidden
                    .logo-img
                        width 100%
                        vertical-align inherit
            .title
                font-size .65rem
                font-family $HP
                -webkit-text-stroke 1px $Black2
                float left
                margin-top .75rem
                color $Orange
                margin-right 1.12rem
            .input
                width 7.6rem
                height 1rem
                line-height 1rem
                background #fff
                border-radius .3rem
                float left 
                margin-top .575rem
                margin-right .8rem
                color #ccc
                box-sizing border-box
                text-align center
            .icon
                float left
                width 1.3rem
                height 1.25rem
                border-radius .3rem
                background rgba(240, 145, 59,.5)
                margin-top .45rem
                margin-right 1.3rem
                .header-icon-search
                    display block
                    font-size 1rem
                    color $Orange
                    margin-top .13rem
                    margin-left .15rem
                    
            .avator 
                width 1.25rem
                height 1.25rem
                background $Black
                border-radius .3rem
                float right
                margin-top .43rem
            
</style>