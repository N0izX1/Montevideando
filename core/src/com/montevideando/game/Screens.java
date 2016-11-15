package com.montevideando.game;


public enum Screens {
	/** Clase de enumerados que tiene las distintas pantallas del juego para poder acceder a ellas desde cualquier clase**/
	

	NIVEL1{
		public AbstractScreen getScreen(Object... params) {
            return new Nivel();
        }
	},
	
	MAINSCREEN {
		public AbstractScreen getScreen(Object... params) {
            return new MainScreen();
        }
	};
	
    public abstract AbstractScreen getScreen(Object... params);

}
