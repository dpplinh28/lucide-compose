package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 17f)
                lineToRelative(5f, -5f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 18f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.ForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forward: ImageVector
    @Composable get() = ForwardDefinition.asImageVector()
