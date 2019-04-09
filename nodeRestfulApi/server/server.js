//const PORT = process.env.PORT || 3333;
const PORT = 3333;

import os from "os";
import express from "express";
import http from "http";
import RoutesConfig from "./config/routes.conf";
import Routes from "./routes/index";

const app = express();
var swaggerUi = require('swagger-ui-express'),
    swaggerDocument = require('./swagger.json');
app.use('/swagger', swaggerUi.serve, swaggerUi.setup(swaggerDocument));
//app.use('/api/v1', Routes);

RoutesConfig.init(app);  ///<<===================
Routes.init(app, express.Router());
require("./models/index");

http.createServer(app)
    .listen(PORT, () => {
      console.log(`up and running @: ${os.hostname()} on port: ${PORT}`);
      console.log(`enviroment: ${process.env.NODE_ENV}`);
    });
