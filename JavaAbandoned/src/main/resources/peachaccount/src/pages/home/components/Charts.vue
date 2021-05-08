<template>
    <div class="layout">
        <div class="charts">
            <div class="wrapper">
                <div class="caption">
                    <div class="tabs close">
                        <span class="iconfont charts-close-icon" @click=handleCloseClick>&#xe608;</span>
                    </div>
                </div>
                <div class="content">
                    <chart></chart>
                </div>
            </div>
        </div>
    </div>
</template>


<script>
import Chart from '../../common/Chart.vue'

export default {
    components: { Chart },
    name:'HomeCharts',
    methods: {
        handleCloseClick (){
            this.$emit('Close','charts')
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
                    font-size .32rem
                    text-align center
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
               
                        
</style>