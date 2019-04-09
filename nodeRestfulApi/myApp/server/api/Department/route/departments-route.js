import departmentsController from '../controller/departments-controller';

export default class departmentsRoute {

  static init(router) {
    // console.log('departments route');
    router.route('/departments').get(departmentsController.getAll);
    // router.get('/departments', departmentsController.getAll);
    router.route('/departments/search/:id').get(departmentsController.getById);

    router.route('/departments/create/:add').post(departmentsController.add);
    router.route('/departments/delete/:id').delete(departmentsController.deleteMember)
    router.route('/departments/update/:id').put(departmentsController.updateDepartment)
  }
}






