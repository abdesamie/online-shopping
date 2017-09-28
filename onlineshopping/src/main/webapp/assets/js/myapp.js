$(function()
		{
			// solving menu problem
			 switch(menu){
			 	case 'About US':
			 		$('#about').addClass('active');
			 	break;
			 	case 'Contact US':
			 		$('#contact').addClass('active');
			 		break;
				case 'All products':
			 		$('#ListProducts').addClass('active');
			 		break;
		 		default:
		 			$('#ListProducts').addClass('active');
		 			$('#a_'+menu).addClass('active');
		 			break;
			 }
		}
		);
