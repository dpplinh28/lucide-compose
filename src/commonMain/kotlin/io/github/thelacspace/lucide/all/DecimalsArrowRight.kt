package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DecimalsArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 18f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 21f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 3.0f)
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

public val LucideIcons.All.DecimalsArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DecimalsArrowRight: ImageVector
    @Composable get() = DecimalsArrowRightDefinition.asImageVector()
