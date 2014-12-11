package org.openntf.domino.nsfdata.structs.cd;

import java.nio.ByteBuffer;

import org.openntf.domino.nsfdata.structs.SIG;

/**
 * This structure is used to define a JPEG or GIF Image that is part of a Domino document. The CDIMAGEHEADER structure follows a CDGRAPHIC
 * structure. CDIMAGESEGMENT structure(s) then follow the CDIMAGEHEADER. (editods.h)
 * 
 * @since Lotus Notes/Domino 5.0
 *
 */
public class CDIMAGEHEADER extends CDRecord {

	// TODO make enum
	public final Unsigned16 ImageType = new Unsigned16();
	public final Unsigned16 Width = new Unsigned16();
	public final Unsigned16 Height = new Unsigned16();
	public final Unsigned32 ImageDataSize = new Unsigned32();
	public final Unsigned32 SegCount = new Unsigned32();
	public final Unsigned32 Flags = new Unsigned32();
	public final Unsigned32 Reserved = new Unsigned32();

	public CDIMAGEHEADER(final CDSignature cdSig) {
		super(cdSig);
	}

	public CDIMAGEHEADER(final SIG signature, final ByteBuffer data) {
		super(signature, data);
	}
}
