package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.TableFreezeColumn24: ImageVector
  get() {
    if (_tableFreezeColumn24 != null) {
      return _tableFreezeColumn24!!
    }
    _tableFreezeColumn24 = fluentIcon(name = "Filled.TableFreezeColumn24", 24f) {
      materialPath {
          moveTo(16.0F, 21.0F)
          horizontalLineToRelative(1.75F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineTo(16.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(5.0F)
          close()
          moveToRelative(0.0F, -6.5F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(5.0F)
          close()
          moveToRelative(-1.5F, -5.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(-5.0F)
          verticalLineToRelative(-5.0F)
          horizontalLineToRelative(5.0F)
          close()
          moveToRelative(0.0F, -1.5F)
          horizontalLineToRelative(-5.0F)
          verticalLineTo(4.5F)
          horizontalLineTo(6.25F)
          curveTo(5.284F, 4.5F, 4.5F, 5.284F, 4.5F, 6.25F)
          verticalLineToRelative(11.5F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineTo(9.5F)
          verticalLineTo(16.0F)
          horizontalLineToRelative(5.0F)
          verticalLineToRelative(5.0F)
          horizontalLineTo(6.25F)
          curveTo(4.455F, 21.0F, 3.0F, 19.545F, 3.0F, 17.75F)
          verticalLineTo(6.25F)
          curveTo(3.0F, 4.455F, 4.455F, 3.0F, 6.25F, 3.0F)
          horizontalLineToRelative(8.25F)
          verticalLineToRelative(5.0F)
          close()
          moveTo(16.0F, 8.0F)
          horizontalLineToRelative(5.0F)
          verticalLineTo(6.25F)
          curveTo(21.0F, 4.455F, 19.545F, 3.0F, 17.75F, 3.0F)
          horizontalLineTo(16.0F)
          verticalLineToRelative(5.0F)
          close()        
      }
    }
    return _tableFreezeColumn24!!
  }

private var _tableFreezeColumn24: ImageVector? = null
