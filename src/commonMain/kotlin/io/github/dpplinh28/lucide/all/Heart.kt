package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 9.591f, -3.676f)
                arcToRelative(.56f, .56f, 0f, false, false, .818f, 0f)
                arcTo(5.49f, 5.49f, 0f, false, true, 22f, 9.5f)
                curveToRelative(0f, 2.29f, -1.5f, 4f, -3f, 5.5f)
                lineToRelative(-5.492f, 5.313f)
                arcToRelative(2f, 2f, 0f, false, true, -3f, .019f)
                lineTo(5f, 15f)
                curveToRelative(-1.5f, -1.5f, -3f, -3.2f, -3f, -5.5f)
            }
}

public val LucideIcons.All.HeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heart: ImageVector
    @Composable get() = HeartDefinition.asImageVector()
