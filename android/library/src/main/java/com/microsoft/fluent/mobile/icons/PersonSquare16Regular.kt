package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.PersonSquare16: ImageVector
  get() {
    if (_personSquare16 != null) {
      return _personSquare16!!
    }
    _personSquare16 = fluentIcon(name = "Regular.PersonSquare16", 16f) {
      materialPath {
          moveTo(9.75F, 8.0F)
          horizontalLineToRelative(-3.5F)
          curveTo(5.56F, 8.0F, 4.962F, 8.565F, 5.08F, 9.246F)
          curveTo(5.268F, 10.332F, 5.896F, 11.5F, 8.0F, 11.5F)
          reflectiveCurveToRelative(2.732F, -1.168F, 2.92F, -2.254F)
          curveTo(11.038F, 8.566F, 10.44F, 8.0F, 9.75F, 8.0F)
          close()
          moveTo(8.0F, 7.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveTo(8.828F, 4.0F, 8.0F, 4.0F)
          reflectiveCurveTo(6.5F, 4.672F, 6.5F, 5.5F)
          reflectiveCurveTo(7.172F, 7.0F, 8.0F, 7.0F)
          close()
          moveTo(2.0F, 4.5F)
          curveTo(2.0F, 3.12F, 3.12F, 2.0F, 4.5F, 2.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.88F, 2.0F, 14.0F, 3.12F, 14.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 14.0F, 2.0F, 12.88F, 2.0F, 11.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(4.5F, 3.0F)
          curveTo(3.672F, 3.0F, 3.0F, 3.672F, 3.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveTo(3.0F, 12.328F, 3.672F, 13.0F, 4.5F, 13.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-7.0F)
          curveTo(13.0F, 3.672F, 12.328F, 3.0F, 11.5F, 3.0F)
          horizontalLineToRelative(-7.0F)
          close()        
      }
    }
    return _personSquare16!!
  }

private var _personSquare16: ImageVector? = null
