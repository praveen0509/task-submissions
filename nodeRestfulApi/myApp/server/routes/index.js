import departmentsRoutes from '../api/Department/route/departments-route';
import employeesRoutes from '../api/Employee/route/employees-route';

export default class Routes {
   static init(app, router) {
     // console.log('Index Route');
     employeesRoutes.init(router);
     departmentsRoutes.init(router);


     app.get("/", (req, res) => res.status(200).send({
       message: "Welcome to the API!"
     }));
     app.use("/", router);
     // app.use('/api/v1', router);

     app.get('/get', (req, res) => res.send('Request for get'));

     app.post('/post', (req, res) => {
       res.send('Request for Post');
     })

   }
}















