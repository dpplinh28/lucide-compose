package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacScorpio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                verticalLineTo(5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
                verticalLineTo(17f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(5f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 19f)
                lineToRelative(-3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 19f)
                verticalLineTo(5.5f)
                arcToRelative(1f, 1f, 0f, false, true, 5f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 5.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2.5f, 3f)
            }
}

public val LucideIcons.All.ZodiacScorpioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacScorpio: ImageVector
    @Composable get() = ZodiacScorpioDefinition.asImageVector()
