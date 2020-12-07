import React, { Component } from "react";
import Navbar from "react-bootstrap/Navbar";
import Nav from "react-bootstrap/Nav";
import Form from "react-bootstrap/Form";
import FormControl from "react-bootstrap/FormControl";
import Button from "react-bootstrap/Button";
import home from "./pages/home";
import TableTeacher from "./pages/TableTeacher";
import TableStudent from "./pages/TableStudent";
import { Route, BrowserRouter as Router, Switch } from "react-router-dom";

export default class App extends Component {
  render() {
    return (
      <Router>
        <div>
          <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
            <Navbar.Brand href="/">Home</Navbar.Brand>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
              <Nav className="mr-auto">
                <Nav.Link href="/teacher">Teacher</Nav.Link>

                <Nav.Link href="/student">Student</Nav.Link>

                <Nav.Link href="/sudject">Sudject</Nav.Link>
              </Nav>
              <Nav>
                <Nav.Item>
                  <Nav.Link href="/regis">Regis Sudject</Nav.Link>
                </Nav.Item>
              </Nav>
            </Navbar.Collapse>
          </Navbar>
        </div>
        <switch>
          <Route path="/student" component={TableStudent} />
          <Route path="/teacher" component={TableTeacher} />
          <Route path="/" exact component={home} />
        </switch>
      </Router>
    );
  }
}
