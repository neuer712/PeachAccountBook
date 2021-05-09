import Login from '../pages/Login';
import Home from '../pages/Home';
import AccountBook from '../pages/AccountBook/AccountBook';
import Setting from '../pages/Setting';
export const mainRoutes = [
    {
      path: "/login",
      component: Login,
    },
    // {
    //   path: "/404",
    //   component: PageNotFound,
    // },
]

export const userRoutes = [
    {
        path: "/user/home",
        component: Home,
        isShow: true,
        title: "首页"
    },
    {
        path: "/user/accountbook",
        component: AccountBook,
        isShow: true,
        title: "账本"
    },
    {
        path: "/user/setting",
        component: Setting,
        isShow: true,
        title: "设置"
    }
]