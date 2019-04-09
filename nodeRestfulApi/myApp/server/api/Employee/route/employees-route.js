import employeesController from '../controller/employees-controller';
import employeesDao from "../dao/employees-dao";

export default class employeesRoute {

  static init(router) {
    router.route('/employees').get(employeesController.getAll);
    console.log('EmployeeRoute');
    // router.get('/departments', departmentsController.getAll);
    router.route('/employees/search/:id').get(employeesController.getById);

    router.route('/employees/create/:add').post(employeesController.add);

    router.route('/employees/delete/:id').delete(employeesController.deleteMember)
    router.route('/employees/update/:id').put(employeesController.updateEmployee)
  }

}






