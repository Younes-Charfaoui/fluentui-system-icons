package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TableFreezeColumnAndRow16: ImageVector
  get() {
    if (_tableFreezeColumnAndRow16 != null) {
      return _tableFreezeColumnAndRow16!!
    }
    _tableFreezeColumnAndRow16 = fluentIcon(name = "Filled.TableFreezeColumnAndRow16", 16f) {
      materialPath {
          moveTo(14.0F, 4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-7.0F)
          curveTo(3.12F, 2.0F, 2.0F, 3.12F, 2.0F, 4.5F)
          verticalLineTo(10.0F)
          horizontalLineToRelative(3.0F)
          verticalLineTo(6.0F)
          horizontalLineTo(3.0F)
          verticalLineTo(4.5F)
          curveTo(3.0F, 3.672F, 3.672F, 3.0F, 4.5F, 3.0F)
          horizontalLineToRelative(7.0F)
          curveTo(12.328F, 3.0F, 13.0F, 3.672F, 13.0F, 4.5F)
          verticalLineToRelative(7.0F)
          curveToRelative(0.0F, 0.828F, -0.672F, 1.5F, -1.5F, 1.5F)
          horizontalLineTo(10.0F)
          verticalLineToRelative(-2.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(3.0F)
          horizontalLineToRelative(5.5F)
          curveToRelative(1.38F, 0.0F, 2.5F, -1.12F, 2.5F, -2.5F)
          verticalLineToRelative(-7.0F)
          close()
          moveTo(10.0F, 6.0F)
          horizontalLineTo(6.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(6.0F)
          close()
          moveToRelative(-5.0F, 5.0F)
          horizontalLineTo(2.0F)
          verticalLineToRelative(0.5F)
          curveTo(2.0F, 12.88F, 3.12F, 14.0F, 4.5F, 14.0F)
          horizontalLineTo(5.0F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _tableFreezeColumnAndRow16!!
  }

private var _tableFreezeColumnAndRow16: ImageVector? = null
