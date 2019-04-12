import studentsDao from '../dao/students-dao'

export default class studentsController {

  static getAll(req, res) {
    console.log('Controller');
    let _body= req.body;
    studentsDao.getAll(_body).then().catch();
  }

  static createNew(req, res) {
    console.log('CreateNew');
    let _body = req.body;
    console.log(req.body);
    studentsDao.createNew(_body).then(() => {
      res.send(200);
    }).catch(res.send(400));
  }


  static updateRow(req, res){
    let _id = req.params.id;
    console.log(_id);
    studentsDao.updateRow(req.body, _id).then(() =>  {
      res.send(200);
    }).catch(() => {res.send(400);})
  }


  static deleteRow(req, res){
    let _id = req.params.id;
    console.log(_id);
    studentsDao.deleteRow(_id).then(() => res.status(200)).catch(() => res.status(400));
  }

}

