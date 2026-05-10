package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PowerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.36f, 6.64f)
                arcTo(9f, 9f, 0f, false, true, 20.77f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.16f, 6.16f)
                arcToRelative(9f, 9f, 0f, true, false, 12.68f, 12.68f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.PowerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PowerOff: ImageVector
    @Composable get() = PowerOffDefinition.asImageVector()
