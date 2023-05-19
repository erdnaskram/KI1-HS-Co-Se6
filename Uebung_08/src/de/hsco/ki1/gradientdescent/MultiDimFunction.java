package de.hsco.ki1.gradientdescent;

import Jama.Matrix;


public class MultiDimFunction implements Function<Vector> 
{
	private double[] q = {0.864330675948689,-0.03144333288598345,-0.0313785921943838,-0.01436924656616794,0.05836507702556233,-0.003502829916987212,0.042907850810685,0.01557372895119363,-0.03681809137864615,0.02035603457153099,-0.008196490536687891,-0.06825495468406811,-0.07878362428052396,0.04612492002070614,-0.02518421880730185,0.01973037891107274,-0.05646246384613255,-0.06774789145671024,-0.001490005994149831,-0.02212343477491654,
			-0.03144333288598344,0.9648583047629907,-0.0650939780489197,-0.07723833528971537,0.02106262989080068,-0.07128685364300735,-0.07596108472139737,-0.01964335089388083,-0.03173209286080096,-0.02329982225002299,-0.04292013252941602,-0.01011069932485954,0.08931337367380163,-0.01858371326143897,0.03255469705406282,0.01294301132171131,-0.04869946390943336,0.005519841216854233,0.01370530427382075,-0.00921194071292664,
			-0.0313785921943838,-0.06509397804891967,1.003240291154517,0.02717832718459068,-0.05721438215676789,0.0261668222164615,0.05910015350736878,-0.04508336338477024,-0.01204371482200361,0.07271250383836421,-0.02602865604683637,-0.03359517324481715,-0.1527346717075773,0.001816061340971257,-0.02284136437788686,-0.09642150739566374,0.01725404024631332,0.007427182805683167,-0.05945784457832492,-0.01582833111858731,
			-0.01436924656616794,-0.07723833528971538,0.02717832718459071,0.9441966022018865,-0.04723059888271602,0.002520940824668436,-0.02341329285188508,-0.01687554981269569,-0.01794665027419659,-0.01611248962625097,-0.001635709603153869,0.002907277032588821,-0.0398222401643153,-0.06405399025028033,-0.005563325329409887,-0.07027026927686224,-0.02204338292454621,-0.03664960479354746,-0.01044011194540453,-0.01033885896545838,
			0.05836507702556232,0.02106262989080069,-0.05721438215676789,-0.047230598882716,0.8695818152914148,-0.04513857414169044,-0.09480487215354109,0.01098521376194468,-0.003513897069479907,-0.01975887312266506,-0.1159276261944799,-0.0659285137341586,0.1001157492742995,0.04693945089158154,-0.08543042998784496,0.05479457220417636,-0.0305384778602687,0.02653811400617175,0.02359210471239834,0.001404692982384003,
			-0.00350282991698721,-0.07128685364300734,0.02616682221646152,0.002520940824668443,-0.04513857414169045,0.9497880855817056,0.02406916574778718,-0.03084399036824274,0.01246048010953625,0.0002179055090049319,0.05650388216167602,-0.09007291165109951,-0.07584168522496552,-0.007701028131803897,-0.05307023570793155,-0.04809667169545911,0.02824918776622161,-0.02691339302374549,-0.06454453710058175,-0.01137070718022134,
			0.04290785081068498,-0.07596108472139737,0.05910015350736877,-0.02341329285188506,-0.09480487215354111,0.02406916574778716,0.8636666900788051,-0.06940915100305496,0.03239193843378329,-0.007105785251495403,-0.01641667715659141,-0.04938215861110105,-0.07955049547707486,-0.004809380726991126,-0.02887359309555533,-0.0782348249891307,0.08090398871781661,0.01749059499547785,0.01091995880757498,-0.0270310864651346,
			0.01557372895119363,-0.01964335089388083,-0.04508336338477025,-0.01687554981269572,0.01098521376194472,-0.03084399036824272,-0.06940915100305498,1.049746157910731,0.004093236975234591,-0.004702719331637216,-0.008471476691611692,0.04548846164149284,-0.13013333775064,-0.003372716107008373,-0.1110148644875679,0.03110075915902811,-0.09210313799514006,0.01093469799924314,0.00997998788882375,-0.0232236104384068,
			-0.03681809137864615,-0.03173209286080095,-0.01204371482200362,-0.01794665027419658,-0.003513897069479909,0.01246048010953626,0.03239193843378329,0.004093236975234603,0.8679130206614488,-0.03767484595608116,-0.02733748483213799,0.004465941500473516,0.02129742210772457,-0.009481326313093862,-0.006307439187101795,-0.04234840278292863,7.137048735621741e-05,-0.0512421763667573,-0.07530403598274514,-0.01627996334054948,
			0.02035603457153101,-0.02329982225002299,0.07271250383836421,-0.01611248962625096,-0.01975887312266507,0.0002179055090049329,-0.0071057852514954,-0.004702719331637207,-0.03767484595608116,0.9184905354452868,-0.01996035814097539,0.05793678586585378,-0.06402325062428733,-0.008088800354120547,-0.01170177978817389,-0.04512567842364363,-0.07123851017450344,-0.06551943390175903,-0.04798276915067767,-0.02516841589135462,
			-0.008196490536687896,-0.04292013252941602,-0.02602865604683636,-0.001635709603153873,-0.1159276261944799,0.05650388216167602,-0.01641667715659139,-0.008471476691611675,-0.02733748483213799,-0.01996035814097539,0.8385411752706132,0.0555193934878606,0.0309069859764809,-0.1623055121158706,0.0681699547056796,-0.009977083882153667,-0.05497777294619387,0.01799931266734614,-0.02227802996613533,-0.0264179303325602,
			-0.0682549546840681,-0.01011069932485957,-0.03359517324481717,0.00290727703258885,-0.0659285137341586,-0.09007291165109949,-0.04938215861110105,0.04548846164149285,0.004465941500473502,0.0579367858658538,0.05551939348786059,0.9857428832179576,-0.08218090839141243,-0.0794238839186969,-0.104306706381622,-0.04348282207422811,-0.05141645083317583,-0.006729347732840472,0.04271114320351266,-0.003349474070043637,
			-0.07878362428052395,0.08931337367380164,-0.1527346717075773,-0.03982224016431528,0.1001157492742995,-0.07584168522496551,-0.07955049547707488,-0.13013333775064,0.02129742210772457,-0.06402325062428731,0.03090698597648087,-0.08218090839141243,0.9790491996248238,-0.04092491249424251,0.06476262887766654,0.009720094220429028,0.0477299030027856,-0.02152159021429005,0.06987460616283643,-0.04760887246568699,
			0.04612492002070614,-0.01858371326143895,0.001816061340971281,-0.06405399025028034,0.04693945089158157,-0.007701028131803918,-0.004809380726991129,-0.003372716107008393,-0.009481326313093855,-0.008088800354120539,-0.1623055121158706,-0.0794238839186969,-0.0409249124942425,1.073137752503563,-0.02934029262375568,0.01252226194142991,-0.05767362527917159,0.018383506337953,-0.1072369415118423,0.0381487650879682,
			-0.02518421880730184,0.0325546970540628,-0.02284136437788688,-0.005563325329409913,-0.08543042998784495,-0.05307023570793156,-0.02887359309555534,-0.1110148644875678,-0.006307439187101799,-0.01170177978817391,0.06816995470567959,-0.104306706381622,0.06476262887766654,-0.02934029262375567,0.9258340299132243,-0.04789623751509273,0.0736960650903927,-0.005291312982487029,-0.001700910585806323,-0.08488029794197416,
			0.01973037891107275,0.01294301132171132,-0.09642150739566374,-0.07027026927686227,0.05479457220417636,-0.04809667169545911,-0.07823482498913072,0.0311007591590281,-0.04234840278292862,-0.04512567842364364,-0.009977083882153672,-0.04348282207422811,0.009720094220429036,0.01252226194142992,-0.04789623751509274,0.9445653806059231,0.0155782406757977,-0.004343594253546115,-0.03178727868740308,0.004675031861158906,
			-0.05646246384613255,-0.04869946390943336,0.01725404024631333,-0.02204338292454623,-0.03053847786026869,0.02824918776622161,0.08090398871781659,-0.09210313799514007,7.137048735621188e-05,-0.07123851017450343,-0.05497777294619385,-0.05141645083317582,0.0477299030027856,-0.05767362527917163,0.07369606509039271,0.0155782406757977,0.8982416401180312,-0.01398770550989043,-0.08547049830145352,-0.007971483921170277,
			-0.06774789145671022,0.005519841216854273,0.007427182805683147,-0.03664960479354746,0.02653811400617176,-0.0269133930237455,0.01749059499547786,0.01093469799924314,-0.05124217636675731,-0.06551943390175903,0.01799931266734612,-0.006729347732840471,-0.02152159021429007,0.01838350633795301,-0.005291312982487017,-0.004343594253546108,-0.01398770550989043,0.8015039191573501,-0.01105834970642032,-0.008873706715767206,
			-0.001490005994149813,0.01370530427382075,-0.05945784457832492,-0.01044011194540451,0.02359210471239834,-0.06454453710058175,0.01091995880757499,0.009979987888823743,-0.07530403598274513,-0.04798276915067767,-0.02227802996613534,0.04271114320351267,0.0698746061628364,-0.1072369415118422,-0.001700910585806325,-0.03178727868740309,-0.08547049830145352,-0.01105834970642031,0.8809300523032964,0.0240279831673969,
			-0.02212343477491652,-0.009211940712926636,-0.01582833111858731,-0.01033885896545839,0.001404692982384008,-0.01137070718022134,-0.0270310864651346,-0.02322361043840679,-0.01627996334054947,-0.02516841589135461,-0.02641793033256021,-0.00334947407004365,-0.04760887246568701,0.03814876508796819,-0.08488029794197416,0.004675031861158906,-0.007971483921170282,-0.008873706715767208,0.02402798316739689,0.8391402791472823}; 
	
	private double[] f = {0.7476461513186414,
			  -0.1625139023134880,
			   0.7906077628627828,
			  -0.1713987209834557,
			   0.6444661877586273,
			  -0.0944304185814690,
			   0.8631391572217756,
			  -0.4202858830672253,
			   0.7226742424621172,
			   0.7321129016463226,
			   0.6464950201327354,
			  -0.2944316018226546,
			   0.9386444529371539,
			  -0.3249803591658292,
			   0.9504229427572920,
			  -0.2519677276645404,
			   0.8192092845341437,
			  -0.1669132556636355,
			   0.6916326274268134,
			  -0.2478771401021533};

	private Matrix Qmat = new Matrix(q,20);
	private Vector Fvec = new Vector(f);
	private double Csac = 92.54705073105841;
	
	/* The gradient of the function is Q*x0 - F */
	@Override
	public Vector gradient(Vector x0) {
		return x0.mult(this.Qmat).minus(Fvec);
	}

	/* The function 1/2*x0*Q*x0 - x0*F + 1/2*C */ 
	@Override
	public double value(Vector x0) {
		return 0.5 * x0.inner(x0.mult(this.Qmat)) - x0.inner(Fvec) + 0.5*Csac;
		
	}
	
	public int numDimensions() {
	  return 20;
	}

	@Override
	public Object hessian(Vector x0) {
		return this.Qmat;
	}

}
