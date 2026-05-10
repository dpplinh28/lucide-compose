package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Armchair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 9f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(1.5f)
                arcToRelative(.5f, .5f, 0f, false, true, -.5f, .5f)
                horizontalLineToRelative(-9f)
                arcToRelative(.5f, .5f, 0f, false, true, -.5f, -.5f)
                verticalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 18f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.ArmchairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Armchair: ImageVector
    @Composable get() = ArmchairDefinition.asImageVector()
