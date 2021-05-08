<template>
    <div ref="chart" class="chart">11</div>
</template>

<script>
export default {
    name:'Chart',
    data (){
        return {
            chartsData:{},
            renderData:{}
        }
    },
    mounted(){
        this.$Bus.$on('renderChart',val=>{
            this.chartsData = val;
            this.renderData = this.formatData()
            this.initChart();
        })
        
    },
    methods: {
        formatData (){
            let type = [],result = [];
            for (let key in this.chartsData){
                let temp = {};
                temp.name = key
                temp.value = this.chartsData[key]
                result.push(temp)
                type.push(key)
            } 
            return {
                type,
                result
            }
        },
        initChart(){
            let chart = this.$echarts.init(this.$refs.chart);
            let data = this.renderData
            console.log(data)
            let option = {
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b}: {c} ({d}%)'
                },
                legend: {
                    orient: 'vertical',
                    left: 10,
                    data: data.type
                },
                series: [
                    {
                        name: '支出原因',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        avoidLabelOverlap: false,
                        label: {
                            show: false,
                            position: 'center'
                        },
                        emphasis: {
                            label: {
                                show: true,
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        },
                        labelLine: {
                            show: false
                        },
                        data: data.result
                    }
                ]
            };
            chart.setOption(option);
        }
    },
    
}

</script>

<style lang="stylus" scoped>
    .chart 
        width 450px
        height 450px
</style>