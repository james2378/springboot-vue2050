const base = {
    get() {
        return {
            url : "http://localhost:8080/yiliaozonghefuwu/",
            name: "yiliaozonghefuwu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiliaozonghefuwu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中山社区医疗综合服务平台"
        } 
    }
}
export default base
