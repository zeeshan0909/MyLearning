package leetcode;

import java.util.Arrays;

public class ValidAnagram {
	
	 public boolean isAnagram(String s, String t) {
	        char[] cs = s.toCharArray();
	        char[] ct = t.toCharArray();
	        Arrays.sort(cs);
	        Arrays.sort(ct);
	        return Arrays.equals(cs, ct);
	    }
	 
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagarzam";
		ValidAnagram obj = new ValidAnagram();
		System.out.println(obj.isAnagram(s, t) );

	}

}

/*
function getTemplatesDesc() {
    var value = $("#typOfCompln").val();
    var templateName = $("#descriptn option:selected").text();
    var src='nonGsAjax!getTemplatesDesc';
    if(value !== "0" && templateName !==""){
        $.ajax({
            url: src,
            dataType: 'html',
            type:'POST',
            data : {
                'value' : value,
                'template' : templateName
            },
            success : function(response) {
                if(response=='null'||response==''){
                    $("#paragraph1").val('');
                }else{
                    $("#paragraph1").val(response);
                }          
               },
               error : function(xhr, errmsg)
            {
                alert("Your session has been expired. Click ok to Relogin.");
                window.location.href = "/nongslite/";
            }
             });

          }

    }*/


    /*<script>
        document.getElementById('citySelect').addEventListener('change', function() {
            var city = this.value;
            if (city) {
                // Create a new XMLHttpRequest object
                var xhr = new XMLHttpRequest();

                // Configure it: GET-request for the URL /api/data/:city
                xhr.open('GET', 'http://localhost:3000/api/data/' + encodeURIComponent(city), true);

                // Set up the callback function for when the request completes
                xhr.onreadystatechange = function() {
                    // Check if the request is complete
                    if (xhr.readyState === 4) {
                        // Check if the request was successful
                        if (xhr.status === 200) {
                            // Parse the JSON response
                            var response = JSON.parse(xhr.responseText);
                            // Handle the response data
                            document.getElementById('cityInfo').innerHTML = `
                                <h2>${response.city}</h2>
                                <p>${response.info}</p>
                            `;
                        } else {
                            // Handle errors
                            document.getElementById('cityInfo').innerHTML = 'Error fetching data';
                        }
                    }
                };

                // Send the request
                xhr.send();
            } else {
                // Clear the city info if no city is selected
                document.getElementById('cityInfo').innerHTML = '';
            }
        });
    </script>
</body>
</html>*/


























