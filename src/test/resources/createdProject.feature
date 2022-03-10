Feature: Project
  Scenario: Crear Actualizar usuario
    When envio POST request a la /api/user.json con el body
    """
      {
        "Email":"denisse@email.com",
        "FullName":"Denisse",
        "Password":"12345"
      }
      """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
    {
    "Id": "IGNORE",
    "Email": "denisse@email.com",
    "Password": null,
    "FullName": "Denisse",
    "TimeZone": 0,
    "IsProUser": false,
    "DefaultProjectId": "IGNORE",
    "AddItemMoreExpanded": false,
    "EditDueDateMoreExpanded": false,
    "ListSortType": 0,
    "FirstDayOfWeek": 0,
    "NewTaskDueDate": -1,
    "TimeZoneId": "Pacific Standard Time"
}
    """
    And guardo el Email de la respuesta en Email_User
    And guardo el Password de la respuesta en Pass_User
    And el atributo FullName deberia ser Denisse
    Given yo uso la authenticacion por token con Email_User y Pass_User
    When envio PUT request a la /api/user/0.json con el body
    """
    {
      "FullName":"Denisse123"
    }
    """
    Then el codigo de respuesta deberia ser 200
    And el atributo FullName deberia ser Denisse123

  Scenario: create project
    Given yo uso la authenticacion por token
    When envio POST request a la /api/projects.json con el body
      """
      {
        "Content":"Cucumber",
        "Icon":"4"
      }
      """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
    {
        "Id": "IGNORE",
        "Content": "Cucumber",
        "ItemsCount": 0,
        "Icon":4,
        "ItemType": 2,
        "ParentId": null,
        "Collapsed": false,
        "ItemOrder": "IGNORE",
        "Children": [
        ],
        "IsProjectShared": false,
        "ProjectShareOwnerName": null,
        "ProjectShareOwnerEmail": null,
        "IsShareApproved": false,
        "IsOwnProject": true,
        "LastSyncedDateTime": "IGNORE",
        "LastUpdatedDate": "IGNORE",
        "Deleted": false,
        "SyncClientCreationId": null
    }
    """
    And guardo el Id de la respuesta en ID_PROJ

  Scenario: crud Item
    Given yo uso la authenticacion por token
    When envio POST request a la /api/items.json con el body
    """
    {
      "Content":"NewItem",
    }
    """
    Then el codigo de respuesta deberia ser 200
    And el expected body deberia ser
    """
    {
    "Id": "IGNORE",
    "Content": "NewItem",
    "ItemType": 1,
    "Checked": false,
    "ProjectId": "IGNORE",
    "ParentId": null,
    "Path": "",
    "Collapsed": false,
    "DateString": null,
    "DateStringPriority": 0,
    "DueDate": "",
    "Recurrence": null,
    "ItemOrder": "IGNORE",
    "Priority": 4,
    "LastSyncedDateTime": "IGNORE",
    "Children": [],
    "DueDateTime": null,
    "CreatedDate": "IGNORE",
    "LastCheckedDate": null,
    "LastUpdatedDate": "IGNORE",
    "Deleted": false,
    "Notes": "",
    "InHistory": false,
    "SyncClientCreationId": null,
    "DueTimeSpecified": true,
    "OwnerId": 701924
}
    """
    And guardo el Id de la respuesta en ID_Item

    When envio GET request a la /api/items/ID_Item.json con el body
    """
    """
    Then el codigo de respuesta deberia ser 200
    And el atributo Content deberia ser NewItem

    When envio PUT request a la /api/items/ID_Item.json con el body
    """
    {
      "Content":"NewItem2"
    }
    """
    Then el codigo de respuesta deberia ser 200
    And el atributo Content deberia ser NewItem2

    When envio DELETE request a la /api/items/ID_Item.json con el body
    """
    """
    Then el codigo de respuesta deberia ser 200
    And el atributo Content deberia ser NewItem2
  Scenario:
    Given yo uso la authenticacion por token
    When envio DELETE request a la /api/authentication/token.json con el body
    """
    {
    "TokenString":"IGNORE",
    "UserEmail":"deni@email.com",
    "ExpirationTime":"IGNORE"
    }
    """
