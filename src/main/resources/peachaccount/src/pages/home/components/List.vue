<template>
    <div class="list">
        <div class="caption">
            <h1 class="title">账户余额</h1>
            <h3 class="number">￥0</h3>
        </div>
        <div class="item-list">
            <div class="item">
                <div class="item-text">流入</div>
                <div class="item-num">￥0</div>
            </div>
            <div class="item">
                <div class="item-text">流出</div>
                <div class="item-num">￥0</div>
            </div>
            <div class="item">
                <div class="item-text">最近一笔</div>
                <div class="item-num">+ ￥0</div>
            </div>
        </div>
    </div>
</template>



<script>
export default {
    name:'HomeList'
}
</script>


<style lang="stylus" scoped>
    @import '~styles/varibles.styl'
    @import '~styles/mixins.styl'
    .list
        width 8.35rem
        height 6.65rem
        margin 1rem .95rem 1.4rem 1rem
        background $Orange2
        border-radius .3rem
        padding 1rem .45rem .7rem .45rem
        box-sizing border-box
        color $Black2
        font-family $HP
        float left
        .caption
            height 2.12rem
            border-bottom 3px solid #707070
            padding 0 .35rem
            .title
                font-size .6rem
                font-family $HP
                margin-bottom .66rem
            .number
                font-size .6rem
                font-family $HP
        .item-list
            padding .52rem .35rem
            height 3.26rem
            box-sizing border-box
            font-size .35rem
            .item
                width 6.75rem
                margin-bottom .5rem 
                &:after
                    clear()
                .item-text
                    float left
                .item-num
                    float right
                

            
            

</style>