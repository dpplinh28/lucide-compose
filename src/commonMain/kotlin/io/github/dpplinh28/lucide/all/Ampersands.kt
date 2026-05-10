package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersands") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 17f)
                curveToRelative(-5f, -3f, -7f, -7f, -7f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                curveToRelative(0f, 2.5f, -5f, 2.5f, -5f, 6f)
                curveToRelative(0f, 1.7f, 1.3f, 3f, 3f, 3f)
                curveToRelative(2.8f, 0f, 5f, -2.2f, 5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                curveToRelative(-5f, -3f, -7f, -7f, -7f, -9f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                curveToRelative(0f, 2.5f, -5f, 2.5f, -5f, 6f)
                curveToRelative(0f, 1.7f, 1.3f, 3f, 3f, 3f)
                curveToRelative(2.8f, 0f, 5f, -2.2f, 5f, -5f)
            }
}

public val LucideIcons.All.AmpersandsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersands: ImageVector
    @Composable get() = AmpersandsDefinition.asImageVector()
