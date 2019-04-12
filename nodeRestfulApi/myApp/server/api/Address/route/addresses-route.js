import addressesController from '../controller/addresses-contoller';

export default class addressesRoutes {
  static init(router) {
    router.route('/addresses').get(addressesController.getAll);
    router.route('/addresses/:create').post(addressesController.createNew);
    router.route('/addresses/update/:id').put(addressesController.updateRow);
    router.route('/addresses/delete/:id').delete(addressesController.deleteRow);
  }
}
