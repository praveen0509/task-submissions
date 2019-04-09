import employeesController from '../controller/employees-controller';
import employeesDao from "../dao/employees-dao";

export default class employeesRoute {

  static init(router) {
    router.route('/employees').get(employeesController.getAll);
    console.log('EmployeeRoute');
    // router.get('/departments', departmentsController.getAll);
    router.route('/employees/:id').get(employeesController.getById);

    router.route('/employees/:add').get(employeesController.add);
  }
}






