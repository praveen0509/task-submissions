import addressesDao from '../dao/addresses-dao'

export default class addressesController {

  static getAll(req, res) {
    console.log('Controller');
    let _body= req.body;
    addressesDao.getAll(_body).then().catch();
  }

  static createNew(req, res) {
    console.log('CreateNew');
    let _body = req.body;
    console.log(req.body);
    addressesDao.createNew(_body).then(() => {
      res.send(200);
    }).catch(res.send(400));
  }


  static updateRow(req, res){
    let _id = req.params.id;
    console.log(_id);
    addressesDao.updateRow(req.body, _id).then(() =>  {
      res.send(200);
    }).catch(() => {res.send(400);})
  }


  static deleteRow(req, res){
    let _id = req.params.id;
    console.log(_id);
    addressesDao.deleteRow(_id).then(() => res.status(200)).catch(() => res.status(400));
  }


}

