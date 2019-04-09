import departmentsController from '../controller/departments-controller';
import departmentsDao from "../dao/departments-dao";

export default class departmentsRoute {

  static init(router) {
    console.log('departments route');
    router.route('/departments').get(departmentsController.getAll);
    // router.get('/departments', departmentsController.getAll);
    router.route('/departments/:id').get(departmentsController.getById);

    router.route('/departments/:add').get(departmentsDao.add);
  }
}






