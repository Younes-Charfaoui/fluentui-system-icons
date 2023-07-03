package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ContactCard32: ImageVector
  get() {
    if (_contactCard32 != null) {
      return _contactCard32!!
    }
    _contactCard32 = fluentIcon(name = "Regular.ContactCard32", 32f) {
      materialPath {
          moveTo(18.0F, 13.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.553F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          reflectiveCurveToRelative(-0.447F, 1.0F, -1.0F, 1.0F)
          horizontalLineToRelative(-6.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          close()
          moveToRelative(1.0F, 4.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          horizontalLineToRelative(6.0F)
          curveToRelative(0.553F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.447F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-6.0F)
          close()
          moveToRelative(-6.0F, -4.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          reflectiveCurveToRelative(-2.0F, -0.895F, -2.0F, -2.0F)
          reflectiveCurveToRelative(0.895F, -2.0F, 2.0F, -2.0F)
          reflectiveCurveToRelative(2.0F, 0.895F, 2.0F, 2.0F)
          close()
          moveToRelative(-6.0F, 4.5F)
          curveTo(7.0F, 16.672F, 7.672F, 16.0F, 8.5F, 16.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, 0.672F, 1.5F, 1.5F)
          curveToRelative(0.0F, 0.0F, 0.0F, 3.5F, -4.0F, 3.5F)
          reflectiveCurveToRelative(-4.0F, -3.5F, -4.0F, -3.5F)
          close()
          moveTo(2.0F, 7.25F)
          curveTo(2.0F, 5.455F, 3.455F, 4.0F, 5.25F, 4.0F)
          horizontalLineToRelative(21.5F)
          curveTo(28.545F, 4.0F, 30.0F, 5.455F, 30.0F, 7.25F)
          verticalLineToRelative(17.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 28.0F, 2.0F, 26.545F, 2.0F, 24.75F)
          verticalLineTo(7.25F)
          close()
          moveTo(5.25F, 6.0F)
          curveTo(4.56F, 6.0F, 4.0F, 6.56F, 4.0F, 7.25F)
          verticalLineToRelative(17.5F)
          curveTo(4.0F, 25.44F, 4.56F, 26.0F, 5.25F, 26.0F)
          horizontalLineToRelative(21.5F)
          curveToRelative(0.69F, 0.0F, 1.25F, -0.56F, 1.25F, -1.25F)
          verticalLineTo(7.25F)
          curveTo(28.0F, 6.56F, 27.44F, 6.0F, 26.75F, 6.0F)
          horizontalLineTo(5.25F)
          close()        
      }
    }
    return _contactCard32!!
  }

private var _contactCard32: ImageVector? = null