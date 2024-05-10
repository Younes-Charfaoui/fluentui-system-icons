package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BookContacts20: ImageVector
  get() {
    if (_bookContacts20 != null) {
      return _bookContacts20!!
    }
    _bookContacts20 = fluentIcon(name = "Filled.BookContacts20", 20f) {
      materialPath {
          moveTo(6.0F, 2.0F)
          curveTo(4.895F, 2.0F, 4.0F, 2.895F, 4.0F, 4.0F)
          verticalLineToRelative(12.0F)
          curveToRelative(0.0F, 1.105F, 0.895F, 2.0F, 2.0F, 2.0F)
          horizontalLineToRelative(9.5F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(15.776F, 17.0F, 15.5F, 17.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          horizontalLineToRelative(10.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          verticalLineTo(4.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(4.0F, 11.0F)
          curveToRelative(-2.143F, 0.0F, -3.0F, -0.938F, -3.0F, -1.875F)
          curveTo(7.0F, 10.504F, 7.576F, 10.0F, 8.286F, 10.0F)
          horizontalLineToRelative(3.428F)
          curveTo(12.424F, 10.0F, 13.0F, 10.504F, 13.0F, 11.125F)
          curveTo(13.0F, 12.059F, 12.143F, 13.0F, 10.0F, 13.0F)
          close()
          moveToRelative(1.5F, -5.5F)
          curveTo(11.5F, 8.328F, 10.828F, 9.0F, 10.0F, 9.0F)
          reflectiveCurveTo(8.5F, 8.328F, 8.5F, 7.5F)
          reflectiveCurveTo(9.172F, 6.0F, 10.0F, 6.0F)
          reflectiveCurveToRelative(1.5F, 0.672F, 1.5F, 1.5F)
          close()        
      }
    }
    return _bookContacts20!!
  }

private var _bookContacts20: ImageVector? = null
