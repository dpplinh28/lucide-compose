package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bean") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.165f, 6.598f)
                curveTo(9.954f, 7.478f, 9.64f, 8.36f, 9f, 9f)
                curveToRelative(-.64f, .64f, -1.521f, .954f, -2.402f, 1.165f)
                arcTo(6f, 6f, 0f, false, false, 8f, 22f)
                curveToRelative(7.732f, 0f, 14f, -6.268f, 14f, -14f)
                arcToRelative(6f, 6f, 0f, false, false, -11.835f, -1.402f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.341f, 10.62f)
                arcToRelative(4f, 4f, 0f, true, false, 5.279f, -5.28f)
            }
}

public val LucideIcons.All.BeanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bean: ImageVector
    @Composable get() = BeanDefinition.asImageVector()
