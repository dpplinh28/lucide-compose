package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DecimalsArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13f, 21f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 18f)
                horizontalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.5f, 0.0f, 0f, false, true, 2.5f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 0.0f, 0f, false, true, -2.5f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(2.5f, 0.0f, 0f, false, true, -2.5f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.5f, 0.0f, 0f, false, true, 2.5f, -0.0f)
                close()
            }
}

public val LucideIcons.All.DecimalsArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DecimalsArrowLeft: ImageVector
    @Composable get() = DecimalsArrowLeftDefinition.asImageVector()
