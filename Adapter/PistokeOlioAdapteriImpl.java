package Adapter;

public class PistokeOlioAdapteriImpl implements PistokeAdapteri {

	// Olio-adapteri käyttää pistoke-oliota, josta muunnos tehdään.
	// Toiminta on sama kuin luokka-adapterissa, mutta tässä tapauksessa kutsutaan pistoke-oliota
	// sen sijaan, että Pistoke-luokkaa peritään.

    private Pistoke pistoke = new Pistoke();
	
	@Override
	public Voltti get24Voltti() {
		return pistoke.getVoltti();
	}

	@Override
	public Voltti get12Voltti() {
		Voltti v= pistoke.getVoltti();
		return MuunnaVoltti(v,2);
	}

	@Override
	public Voltti get3Voltti() {
		Voltti v= pistoke.getVoltti();
		return MuunnaVoltti(v,8);
	}
	
	private Voltti MuunnaVoltti(Voltti v, int kerroin) {
		return new Voltti(v.getVoltit()/kerroin);
	}
}
