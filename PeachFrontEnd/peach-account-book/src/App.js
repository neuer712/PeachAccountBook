import React from 'react';
// import logo from './logo.svg';
import './App.css';
import "antd/dist/antd.css";
import {
  Route,
  Switch,
  Redirect,
} from "react-router-dom";
import { userRoutes } from "./routes";
import Frame from "./components/Frame";

function App() {
  return (
    <Frame>
      <Switch>
      {userRoutes.map((route) => {
          return (
            <Route
              key={route.path}
              path={route.path}
              exact={route.exact}
              render={(routeProps) => {
                return <route.component {...routeProps} />;
              }}
            />
          );
        })}
        <Redirect to={userRoutes[0].path} from="/user" exact />
        <Redirect to="/404" />
      </Switch>
    </Frame>
  );
}

export default App;
