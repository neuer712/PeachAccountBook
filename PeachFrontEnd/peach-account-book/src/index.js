import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Redirect,
} from "react-router-dom";
import { mainRoutes } from "./routes";

ReactDOM.render(
  <Router>
    <Switch>
      <Route
        path="/user"
        render={(routeProps) => {
          return <App {...routeProps} />;
        }}
      />
      {mainRoutes.map((route) => {
        return (
          <Route
            key={route.path}
            path={route.path}
            component={route.component}
          />
        );
      })}
      <Redirect to="/user" from="/" exact />
    </Switch>
  </Router>,
  document.getElementById("root")
);
