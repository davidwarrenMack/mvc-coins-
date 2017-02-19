package controllers;


import models.CoinCollection;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import static play.libs.Json.toJson;

import javax.inject.Inject;


public class CoinCollectionController extends Controller
{
    private final FormFactory formFactory;
    private final JPAApi jpaApi;

    @Inject
    public CoinCollectionController(FormFactory formFactory, JPAApi jpaApi) {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getCoinCollection()
    {
        CoinCollection coins = new CoinCollection(10,5,3,2);

        return ok(views.html.coincollection.render(coins));
    }
}


