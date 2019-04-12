import studentsController from '../controller/students-controller';

export default class studentsRoutes {
  static init(router) {
    router.route('/students').get(studentsController.getAll);
    router.route('/students/:create').post(studentsController.createNew);
    router.route('/students/update/:id').put(studentsController.updateRow);
    router.route('/students/delete/:id').delete(studentsController.deleteRow);
  }
}


