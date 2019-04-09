import hospitalsDAO from '../dao/hospitals-dao';
import SuccessResponse from "~/server/utils/SuccessResponse";

export default class hospitalsController {
  static getAll(req, res) {
    var _req_limit = req.query.limit
    const _query = req.query;
    hospitalsDAO
      .getAll(_query)
      .then(hospitalss =>{
        res.status(200);
        res.json(new SuccessResponse("Hospitals", hospitalss.rows, { count: hospitalss.count, limit: _req_limit }))})
      .catch(error => res.status(400).json(error));
  }

  static getById(req, res) {
    let _id = req.params.id;

    hospitalsDAO
      .getById(_id)
      .then((hospital) => res.status(200).json(hospital))
      .catch(error => res.status(400).json(error));
  }
}
