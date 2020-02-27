package com.doccrain.utils;

public class Router {

    public static final String INDEX = "";
    public static final String AGENTE = "/agente";

    // Las rutas de operación
    public static final String LIST = "/list";
    public static final String GET = "/get/{id}";
    public static final String ADD = "/add";
    public static final String UPDATE = "/update/{id}";
    public static final String DELETE = "/delete/{id}";
    public static final String GETAGENTE_X_GRUPO = "/axg";
    public static final String GETAGENTE_X_GRUPO_BY_ID = "/axgid/{id}";
    public static final String GET_BY_CODE = "/code/{code}";

}
