import React, { Component } from "react";
import Table from "react-bootstrap/Table";
import PageItem from 'react-bootstrap/PageItem'

export default class TableStudent extends Component {
  constructor() {
    super();
    this.state = {
      data: null,
      error: null,
      isLoaded: false,
    };
    this.getData();
  }

  getData() {
    let data = fetch("/demo/allStudent").then(
      //http://10.5.50.108:8000

      (resp) => {
        resp.json().then((res) => {
          this.setState({
            isLoaded: true,
            data: res,
          });
        });
      },
      (error) => {
        this.setState({
          isLoaded: true,
          error,
        });
      }
    );
  }

  render() {
    const { error, isLoaded, data } = this.state;
    var size = 0;
    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
        <div>
          {/* <div>{JSON.stringify(data)}</div> */}
          <Table striped bordered hover size="sm">
            <thead>
              <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Year</th>
              </tr>
            </thead>
            <tbody>
              {data.map((item) => (
                <tr>
                  <td>{item.id}</td>
                  <td>{item.fist_name}</td>
                  <td>{item.last_name}</td>
                  <td>{item.year}</td>
                </tr>
              ))}
            </tbody>
          </Table>
          {/* <div>
            <Pagination>
              <Pagination.First />
              <Pagination.Prev />
              <Pagination.Item>{1}</Pagination.Item>
              <Pagination.Ellipsis />

              <Pagination.Item>{10}</Pagination.Item>
              <Pagination.Item>{11}</Pagination.Item>
              <Pagination.Item active>{12}</Pagination.Item>
              <Pagination.Item>{13}</Pagination.Item>
              <Pagination.Item disabled>{14}</Pagination.Item>

              <Pagination.Ellipsis />
              <Pagination.Item>{20}</Pagination.Item>
              <Pagination.Next />
              <Pagination.Last />
            </Pagination>
          </div> */}
        </div>
      );
    }
  }
}
