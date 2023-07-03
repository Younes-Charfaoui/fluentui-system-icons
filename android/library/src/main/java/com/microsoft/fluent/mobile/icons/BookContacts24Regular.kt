package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.BookContacts24: ImageVector
  get() {
    if (_bookContacts24 != null) {
      return _bookContacts24!!
    }
    _bookContacts24 = fluentIcon(name = "Regular.BookContacts24", 24f) {
      materialPath {
          moveTo(15.5F, 12.25F)
          curveToRelative(0.0F, -0.414F, -0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-5.0F)
          curveTo(9.336F, 11.5F, 9.0F, 11.836F, 9.0F, 12.25F)
          verticalLineToRelative(0.5F)
          curveToRelative(0.0F, 1.0F, 1.383F, 1.75F, 3.25F, 1.75F)
          reflectiveCurveToRelative(3.25F, -0.75F, 3.25F, -1.75F)
          verticalLineToRelative(-0.5F)
          close()
          moveTo(14.0F, 8.745F)
          curveTo(14.0F, 7.78F, 13.217F, 7.0F, 12.25F, 7.0F)
          reflectiveCurveTo(10.5F, 7.779F, 10.5F, 8.745F)
          curveToRelative(0.0F, 0.967F, 0.783F, 1.751F, 1.75F, 1.751F)
          reflectiveCurveTo(14.0F, 9.712F, 14.0F, 8.746F)
          close()
          moveTo(4.0F, 4.5F)
          curveTo(4.0F, 3.12F, 5.12F, 2.0F, 6.5F, 2.0F)
          horizontalLineTo(18.0F)
          curveToRelative(1.38F, 0.0F, 2.5F, 1.12F, 2.5F, 2.5F)
          verticalLineToRelative(14.25F)
          curveToRelative(0.0F, 0.414F, -0.336F, 0.75F, -0.75F, 0.75F)
          horizontalLineTo(5.5F)
          curveToRelative(0.0F, 0.552F, 0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(13.25F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(20.164F, 22.0F, 19.75F, 22.0F)
          horizontalLineTo(6.5F)
          curveTo(5.12F, 22.0F, 4.0F, 20.88F, 4.0F, 19.5F)
          verticalLineToRelative(-15.0F)
          close()
          moveToRelative(1.5F, 0.0F)
          verticalLineTo(18.0F)
          horizontalLineTo(19.0F)
          verticalLineTo(4.5F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(6.5F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          close()        
      }
    }
    return _bookContacts24!!
  }

private var _bookContacts24: ImageVector? = null
