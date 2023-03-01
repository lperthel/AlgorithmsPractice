package com.lperthel.sequences;

public class VersionControl {
	int bad;
	boolean isBadVersion(int version) {
		if(version >= bad)
			return true;
		else return false;
	}

}
