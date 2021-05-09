import React from "react";
import { Layout, Menu } from "antd";
import { userRoutes } from "../../routes";
import { withRouter } from "react-router-dom";
import { MenuUnfoldOutlined, MenuFoldOutlined } from "@ant-design/icons";

const { Header, Content, Sider, Footer } = Layout;
const routes = userRoutes.filter((item) => item.isShow);

class index extends React.Component {
  state = {
    collapsed: false,
  };

  toggle = () => {
    this.setState({
      collapsed: !this.state.collapsed,
    });
  };
  render() {
    const path = this.props.location.pathname;
    return (
      <Layout>
        <Sider trigger={null} collapsible collapsed={this.state.collapsed}>
          <Menu
            theme="dark"
            mode="inline"
            selectedKeys={[path]}
            defaultOpenKeys={["sub1"]}
            style={{ height: "100%", borderRight: 0 }}
          >
            <Menu.Item key='1' style={{height: '84px', marginTop: '0px', marginBottom: '0px'}}>
              |||
            </Menu.Item>
            {routes.map((item) => {
              return (
                <Menu.Item
                  key={item.path}
                  onClick={(p) => this.props.history.push(p.key)}
                >
                  {/* <i
                        className={item.icon}
                        style={{ marginRight: "10px" }}
                      /> */}

                  {item.title}
                </Menu.Item>
              );
            })}
          </Menu>
        </Sider>
        <Layout className="site-layout">
          <Header className="site-layout-background" style={{ padding: 0, height: '84px' }}>
            {React.createElement(
              this.state.collapsed ? MenuUnfoldOutlined : MenuFoldOutlined,
              {
                className: "trigger",
                onClick: this.toggle,
                style: {
                  color: 'white'
                }
              }
            )}
          </Header>
          <Content
            className="site-layout-background"
            style={{
              padding: 24,
              margin: 0,
              minHeight: 280,
            }}
          >
            {this.props.children}
          </Content>
          <Footer style={{ textAlign: "center" }}>
            PeachAccountBook ©2021 Created by LaiLaiBear and ViviCat
          </Footer>
        </Layout>
      </Layout>
    );
  }
}

export default withRouter(index);
