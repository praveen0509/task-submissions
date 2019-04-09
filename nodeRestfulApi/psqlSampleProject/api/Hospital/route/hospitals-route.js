import hospitalsController from '../controller/hospitals-controller';

export default class hospitalsRoutes {
  static init(router) {
    router
      .route('/hospitals')
      .get(hospitalsController.getAll)

    router
      .route('/hospitals/:id')
      .get(hospitalsController.getById);
  }
}
