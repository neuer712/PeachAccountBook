import React from "react";
import { Card, Row, Col } from "antd";
import { FileAddOutlined } from "@ant-design/icons";
import "./styles.scss";

const { Meta } = Card;

export default class AccountBook extends React.Component {
  render() {
    return (
      <Card className="container">
        <Row gutter={[40, 16]}>
          <Col span={4} className="item">
            <Card
              hoverable
              style={{ width: 240 }}
              cover={
                <img
                
                  src="https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png"
                />
              }
            >
              <Meta
                title="Europe Street beat"
                description="www.instagram.com"
              />
            </Card>
          </Col>
          <Col span={4} className="item">
            <FileAddOutlined className="add" />
          </Col>
          {/* <Col span={4} className="item">
            <FileAddOutlined className="add" />
          </Col> */}
        </Row>
      </Card>
    );
  }
}
