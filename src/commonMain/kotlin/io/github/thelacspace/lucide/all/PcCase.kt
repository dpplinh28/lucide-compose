package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PcCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 6f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.PcCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PcCase: ImageVector
    @Composable get() = PcCaseDefinition.asImageVector()
