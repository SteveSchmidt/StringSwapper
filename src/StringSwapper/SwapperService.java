package StringSwapper;

import StringSwapper.dto.SwappingObject;


public class SwapperService {

	StringBuilder stringToBeSwapped = new StringBuilder();
	
	//authenticate verifies the StringId passed 
	public boolean authenticate( String stringId ){
		
		if( stringId == null || stringId.trim() == ""){
			return false;
		}
		else {
			return true;
		}
		
	}
	
	//	getStateDetails sets stateId and capital for the state object
	public SwappingObject makeTheSwap( String stringId ) {
		SwappingObject swappingObject = new SwappingObject();
		stringToBeSwapped.append( stringId);
		swappingObject.setStringId( stringId );
		swappingObject.setSwappedId( stringToBeSwapped.reverse().toString());
		return swappingObject;
		
	}
}
