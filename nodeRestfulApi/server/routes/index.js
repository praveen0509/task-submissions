import userRoutes from "~/server/api/user/route/user-route"
import StaticDataRoute from "~/server/api/static-data/route/static-data-route"
import searchRoutes from "~/server/api/search-providers/route/search-route"
import hospitalsRoutes from "~/server/api/Hospital/route/hospitals-route"
import physiciansRoutes from "~/server/api/Physician/route/physicians-route"
import locationRoutes from "~/server/api/location/route/location-route"
export default class Routes {
   static init(app, router) {
     hospitalsRoutes.init(router);
     //add other routes
     app.use("/api/v1", router);
   }
}
